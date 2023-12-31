package de.rogallab.mobile.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import de.rogallab.mobile.logDebug

@Composable
fun RegisterScreen3(
   name:            String,          // State ↓
   onNameChange:    (String)->Unit,  // Event ↑
) {
   logDebug("ok>RegisterScreen3    .", "Composition {$name}")
   RegisterContent(
      name = name,                         // State ↓
      onNameChange = { onNameChange(it) }
   )
}

@Preview
@Composable
fun PreviewRegisterScreen3() {

   var name    by rememberSaveable { mutableStateOf("") }
   var isError by rememberSaveable { mutableStateOf(false) }

   RegisterScreen3(
      name = name,
      onNameChange = { name = it },
   )
}
