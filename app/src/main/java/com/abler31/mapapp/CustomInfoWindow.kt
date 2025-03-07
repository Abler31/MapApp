package com.abler31.mapapp

import android.widget.TextView
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.infowindow.InfoWindow

class CustomInfoWindow(
    layoutResId: Int,
    mapView: MapView,
    private val nameStr: String,
    private val trackStr: String,
    private val timeStr: String
) : InfoWindow(layoutResId, mapView) {

    val name: TextView =
        mView.findViewById(R.id.tv_window_name)
    val info: TextView =
        mView.findViewById(R.id.tv_window_info)

    override fun onOpen(item: Any?) {
        name.text = nameStr
        info.text = trackStr.plus(", ").plus(timeStr)
        mView.translationX = 195f
        mView.translationY = 310f
    }

    override fun onClose() {}

}