package by.slavintodron.androidintership_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.slavintodron.androidintership_1.controller.Controller
import by.slavintodron.androidintership_1.databinding.ActivityMainBinding
import by.slavintodron.androidintership_1.model.tests.*


class MainActivity : AppCompatActivity(), ImainActivity {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val controller = Controller(this)

        binding.buttonExecuteTests.setOnClickListener {
            controller.onExecTest(1245, TestFactory().make())
        }

    }

    override fun onTestResult(result: List<TestReport>) {
        result.forEach(){ it ->
            binding.textViewServer.text = binding.textViewServer.text.toString() + it.sender.toString() +" "
            binding.textViewServer.text = binding.textViewServer.text.toString() + it.value.toString() +" "
        }

    }
}