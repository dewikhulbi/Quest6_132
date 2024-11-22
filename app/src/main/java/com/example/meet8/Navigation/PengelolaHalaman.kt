package com.example.meet8.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.meet8.ui.view.screen.DatailView
import com.example.meet8.ui.view.screen.MahasiswaFormView
import com.example.meet8.ui.view.screen.RencanaStudyView
import com.example.meet8.ui.view.screen.SplashView
import com.example.meet8.ui.view.viewmodel.MahasiswaViewModel
import com.example.meet8.ui.view.viewmodel.RencanaStudyViewModel


enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
)