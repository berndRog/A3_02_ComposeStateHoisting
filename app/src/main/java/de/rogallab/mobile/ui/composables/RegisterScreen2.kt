package de.rogallab.mobile.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import de.rogallab.mobile.logDebug

@Composable
fun RegisterScreen2() {

   var name    by remember { mutableStateOf("") }
   var isError by remember { mutableStateOf(false) }

   logDebug("ok>RegisterScreen2    .", "Composition {$name}")

   RegisterContent(
      name            = name,                               // State ↓
      onNameChange    = { value:String -> name = value },   // Event ↑
      isErrorInName   = isError,                            // State ↓
      onIsErrorChange = { value:Boolean -> isError = value }// Event ↑
   )
}


@Preview
@Composable
fun PreviewRegisterScreen2() {
   RegisterScreen2()
}