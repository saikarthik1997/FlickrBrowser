package com.sri.flickrbrowser

import android.os.AsyncTask

enum class DownloadStatus {
    OK, IDLE, NOT_INITIALISED, FAILED_OR_EMPTY, PERMISSIONS_ERROR, ERROR
}

class GetRawData : AsyncTask<String, Void, String>() {
    private val TAG="GetRawData"
    private var downloadStatus=DownloadStatus.IDLE
    override fun doInBackground(vararg params: String?): String {
        TODO("Not yet implemented")
    }
}