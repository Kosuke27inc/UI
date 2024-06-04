package jp.techacademy.kosuke.miyazaki.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // 追加
import android.view.View // 追加
import androidx.appcompat.app.AlertDialog
import jp.techacademy.kosuke.miyazaki.ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener { // 変更

    private lateinit var binding: ActivityMainBinding //追加

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)//追加
        val view = binding.root//追加
        setContentView(view)//変更

        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            binding.textView.text = binding.editText.text.toString()
        } else if (v.id == R.id.button2) {
            showAlertDialog()
        }
    }

    private fun showAlertDialog() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("タイトル")
        alertDialogBuilder.setMessage("メッセージ")

        alertDialogBuilder.setPositiveButton("肯定"){dialog, which ->
            Log.d("UI_PARTS", "肯定ボタン")
        }

        alertDialogBuilder.setNeutralButton("中立"){_,_ ->
            Log.d("UI_PARTS", "中立ボタン")
        }

        alertDialogBuilder.setNegativeButton("否定"){_,_ ->
            Log.d("UI_PARTS", "否定ボタン")
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}