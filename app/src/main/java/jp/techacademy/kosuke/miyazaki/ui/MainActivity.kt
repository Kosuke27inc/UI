package jp.techacademy.kosuke.miyazaki.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // 追加
import android.view.View // 追加
import jp.techacademy.kosuke.miyazaki.ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener { // 変更

    private lateinit var binding: ActivityMainBinding //追加

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)//追加
        val view = binding.root//追加
        setContentView(view)//変更

        //View BindingでUI部品を指定
        binding.button1.text = "ベンジャミンボタン"
        binding.button1.setOnClickListener {
            //EditTextの文字列をTextViewに設定
            binding.textView.text = binding.editText.text.toString()
        }
    }
    // 以下の関数を追加
    override fun onClick(v: View) {
        Log.d("UI_PARTS", "ボタンをタップしました")

    //以下を追加
    binding.textView.text = "テキスト"

    binding.textView.setTextColor(Color.MAGENTA)
    }

}