package com.example.myrecyclerviewapp2

import android.content.Context
import android.content.res.Resources

class Contacts(private val context : Context) {
    //private val res : Resources =
    //private val titles = res.getStringArray(R.array.contactNames)
    private val res : Resources = context.resources
    var names: Array<String> = res.getStringArray(R.array.contactNames)
//    var names = arrayOf("Reuven", "Shimon","Levi","Yehuda","Yissachar","Zevulin","Dan","Naftali","Gad","Asher", "Yosef", "Binyamin")
   var addresses = arrayOf("Address 1", "Address 2","Address 3","Address 4","Address 5","Address 6","Address 7","Address 8","Address 9","Address 10","Address 11", "Address 12")
    var numbers = arrayOf("123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890","123-456-7890",)
   var emails = arrayOf("beniYisroel@torah.org", "beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org","beniYisroel@torah.org", )
    var images = arrayOf(R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,)

}