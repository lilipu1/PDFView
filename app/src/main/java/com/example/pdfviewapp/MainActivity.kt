package com.example.pdfviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val pdfUrl =
            "https://aoche201701.oss-cn-shenzhen.aliyuncs.com/20190111%E5%88%9B%E6%A0%BC%E8%9E%8D%E8%B5%84%E7%94%B3%E8%AF%B7%E8%A1%A8_1557375697576.pdf"

        const val bookUrl =
            "http://www.gov.cn/zhengce/pdfFile/2020_PDF.pdf"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_pdf.setOnClickListener {
            startActivity(
                PdfViewerActivity.buildIntent(
                    this,
                    bookUrl,
                    false,
                    "测试文档",
                    "test"
                )
            )
        }
    }
}