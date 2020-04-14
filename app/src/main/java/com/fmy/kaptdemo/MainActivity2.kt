package com.fmy.kaptdemo

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import permissions.dispatcher.NeedsPermission
import permissions.dispatcher.RuntimePermissions

@RuntimePermissions
class MainActivity2 : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
  @NeedsPermission(Manifest.permission.CAMERA)
  fun showCamera2() {

  }
}
