package com.example.calc

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {


    private val _str = mutableStateOf("")
    val str: State<String> = _str
    fun Clear()
    {
        _str.value=""
    }
    fun Helper(sti: String)
    {
        _str.value=_str.value+sti
    }
    fun Rub()
    {
        _str.value=_str.value.dropLast(1)
    }
    fun isOperand(ch : Char): Boolean
    {
        if(ch=='/' || ch=='*' || ch=='+' || ch=='-')
        {return true}
        else
        {return false}
    }
    fun valuee(ch : Char): Int
    {
        return (ch.code-'0'.code)
    }
    fun Evaluate()
    {
        var st=_str.value

        var sz= st.length
        if(sz==0){return}

        if(isOperand(st[0]) || isOperand(st[sz-1]))
        {return}
        var res =valuee(st[0])
        sz -= 1
        for(i in 1..sz step 2)
        {
            var opr = st[i]
            var opd = st[i+1]
            if (isOperand(opd))  {return}
            if (opr == '+')       res += valuee(opd)
            else if (opr == '-')  res -= valuee(opd)
            else if (opr == '*')  res *= valuee(opd)
            else if (opr == '/')  res /= valuee(opd)
        }
        _str.value=res.toString()
    }

}