package com.codingwithmitch.coroutineexamples.ui.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.codingwithmitch.coroutineexamples.data.network.ApiClient
import com.codingwithmitch.coroutineexamples.R

import com.codingwithmitch.coroutineexamples.databinding.FragmentInitialBinding
import com.codingwithmitch.coroutineexamples.ui.viewmodel.QuoteViewModel


class InitialFragment : Fragment() {
//    private lateinit var adapter:DogAdapter
    private val dogImages=mutableListOf<String>()
    private var _binding: FragmentInitialBinding? = null
    private val binding get() = _binding!!
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitialBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        initRecyclerview()
binding.button.setOnClickListener {
    quoteViewModel.onCreate( binding.textView2.text.toString())
//    CoroutineScope(Dispatchers.IO).launch {
//        fakeApiRequest( binding.textView2.text.toString())
//    }
    quoteViewModel.quoteModel.observe(viewLifecycleOwner) { current ->
        findNavController().navigate(R.id.action_initialFragment_to_secondFragment)

    }

}
}


//    private fun initRecyclerview() {
//        adapter=DogAdapter(dogImages)
//        binding.recyclerView.layoutManager= LinearLayoutManager(this.context)
//        binding.recyclerView.adapter=adapter

//    }
//    private fun getRetrofit(): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl("https://api.openweathermap.org/data/2.5/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }


//    private fun showError() {
//        Toast.makeText(this.context,"ha ocurrido error", Toast.LENGTH_SHORT).show()
//    }










}