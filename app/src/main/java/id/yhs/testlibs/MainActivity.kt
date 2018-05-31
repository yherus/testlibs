package id.yhs.testlibs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.yhs.libstest.mat
import id.yhs.testlibs2.str
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val mat:mat
        txtmat.text =  mat().plus(3,5).toString()
        txtstr.text =  str().plus("xxx","yyy")
    }
}
