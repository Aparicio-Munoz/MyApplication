package com.example.p1.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onNavigateToProfile: () -> Unit,
    onNavigateToDetail: (String, String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("🏠 Pantalla Principal", style = MaterialTheme.typography.headlineLarge)

        Button(onClick = onNavigateToProfile) {
            Text("Ir a Perfil")
        }

        Button(onClick = { onNavigateToDetail("456", "Smartphone") }) {
            Text("Ver Producto 456")
        }
    }
}
