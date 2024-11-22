package com.example.meet8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.meet8.data.MataKuliah
import com.example.meet8.ui.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMatakuliah(mkPilihan: String) {
        _krsState.update {  stateMK -> stateMK.copy(matakuliah = mkPilihan) }
    }

    fun setKelas(kelasPilihan: String) {
        _krsState.update {  stateMK -> stateMK.copy(kelas = kelasPilihan) }
    }

    fun saveDataKRS(ls: MutableList<String>){
        _krsState.update { status -> status.copy(
            matakuliah = ls[0],
            kelas = ls[1]
        )
        }
    }
}