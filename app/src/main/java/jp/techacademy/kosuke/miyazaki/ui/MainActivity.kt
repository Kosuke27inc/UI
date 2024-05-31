package jp.techacademy.kosuke.miyazaki.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.kosuke.miyazaki.ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //追加

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)//追加
        val view = binding.root//追加
        setContentView(view)//変更

        //View BindingでUI部品を指定
        binding.button1.text = "ベンジャミンボタン"
    }
}