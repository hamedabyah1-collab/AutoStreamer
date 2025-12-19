package com.threebya7.carbrowser

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.CarIcon
import androidx.car.app.model.GridItem
import androidx.car.app.model.GridTemplate
import androidx.car.app.model.ItemList
import androidx.car.app.model.OnClickListener
import androidx.car.app.model.Template
import androidx.core.graphics.drawable.IconCompat

class MainCarScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {
        val gridBuilder = ItemList.Builder()

        // 1. YouTube Button
        gridBuilder.addItem(
            GridItem.Builder()
                .setTitle(carContext.getString(R.string.youtube_button))
                .setText("عرض يوتيوب")
                .setImage(CarIcon.Builder(IconCompat.createWithResource(carContext, R.drawable.ic_youtube)).build())
                .setOnClickListener(OnClickListener {
                    // In a real sideloaded app, this would launch the WebView activity on the phone
                    // and mirror it to the car screen.
                    // For this Car App Library template, we will just show a message.
                    carContext.getCarService(CarContext.APP_SERVICE)
                        .showToast("فتح يوتيوب (يتطلب تطبيق ميرورينج خارجي)")
                })
                .build()
        )

        // 2. TikTok Button
        gridBuilder.addItem(
            GridItem.Builder()
                .setTitle(carContext.getString(R.string.tiktok_button))
                .setText("عرض تيك توك")
                .setImage(CarIcon.Builder(IconCompat.createWithResource(carContext, R.drawable.ic_tiktok)).build())
                .setOnClickListener(OnClickListener {
                    carContext.getCarService(CarContext.APP_SERVICE)
                        .showToast("فتح تيك توك (يتطلب تطبيق ميرورينج خارجي)")
                })
                .build()
        )

        // 3. General Browser Button
        gridBuilder.addItem(
            GridItem.Builder()
                .setTitle(carContext.getString(R.string.general_browser_button))
                .setText("تصفح عام")
                .setImage(CarIcon.Builder(IconCompat.createWithResource(carContext, R.drawable.ic_browser)).build())
                .setOnClickListener(OnClickListener {
                    carContext.getCarService(CarContext.APP_SERVICE)
                        .showToast("فتح المتصفح العام (يتطلب تطبيق ميرورينج خارجي)")
                })
                .build()
        )

        return GridTemplate.Builder()
            .setTitle(carContext.getString(R.string.car_app_name))
            .setHeaderAction(Action.APP_ICON)
            .setSingleList(gridBuilder.build())
            .build()
    }
}
