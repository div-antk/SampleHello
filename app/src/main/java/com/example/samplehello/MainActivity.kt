package com.example.samplehello

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplehello.ui.theme.SampleHelloTheme

class MainActivity : ComponentActivity() {
    // アプリのエントリポイントであり、他の関数を呼び出してUIを構築する
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // コンポーズ可能な関数を介してレイアウトを定義する
        setContent {
            SampleHelloTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

// @Composableアノテーションがついた関数はすべて、setContent() 関数や他のコンポーズ可能な関数から呼び出すことができる
@Composable
fun Greeting(name: String) {
    Text(text = "私の名前は $name です")
}

// アプリ全体をビルドせずにアプリの外観を確認できる機能
// そのために @Previewアノテーションを追加する
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SampleHelloTheme {
        Greeting("うどん")
    }
}