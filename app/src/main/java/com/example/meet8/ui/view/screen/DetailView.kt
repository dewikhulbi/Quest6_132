package com.example.meet8.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meet8.ui.model.Mahasiswa
import com.example.meet8.ui.model.RencanaStudi

@Composable
fun DatailView(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    onBackButtonClicked: () -> Unit,
    onResetButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Detail Mahasiswa", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        // Menampilkan data Mahasiswa
        DetailRow(label = "Nama", value = mahasiswa.nama)
        DetailRow(label = "NIM", value = mahasiswa.nim)
        DetailRow(label = "Email", value = mahasiswa.email)

        Spacer(modifier = Modifier.padding(8.dp))

