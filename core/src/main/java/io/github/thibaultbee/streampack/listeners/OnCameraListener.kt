/*
 * Copyright (C) 2021 Thibault B.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.thibaultbee.streampack.listeners

/**
 * Simple event bridge for when the camera changes.
 */
object CameraEventBridge {
    var listener: OnCameraListener? = null

    fun cameraOpened(cameraId: String, isFrontCamera: Boolean) {
        println("running cameraOpened from cameraEventBridge, is front camera $isFrontCamera")
        listener?.onCameraOpened(cameraId, isFrontCamera)
    }
}

/**
 * Interface for functions that implement onCameraOpened.
 */
interface OnCameraListener {

    fun onCameraOpened(cameraId: String, isFrontCamera: Boolean)
}