package com.example.burgershub.presenter.burgers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.burgershub.data.model.ErrorResponse
import com.example.burgershub.domain.usecase.GetBurgerByNameUseCase
import com.example.burgershub.domain.usecase.GetBurgersUseCase
import com.example.burgershub.util.StateView
import com.example.burgershub.util.getErrorResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class BurgersViewModel @Inject constructor(
    private val getBurgersUseCase: GetBurgersUseCase,
    private val getBurgersByNameUseCase: GetBurgerByNameUseCase
): ViewModel() {

    fun getBurgers() = liveData(Dispatchers.IO) {
        try {
            emit(StateView.Loading())

            val burgers = getBurgersUseCase.invoke()

            emit(StateView.Success(burgers))
        } catch (ex: HttpException) {
            val error = ex.getErrorResponse<ErrorResponse>()
            emit(StateView.Error(error?.message))
        } catch (ex: Exception) {
            ex.printStackTrace()
            emit(StateView.Error(ex.message))
        }
    }

    fun getBurgerByName(name: String) = liveData(Dispatchers.IO) {
        try {
            emit(StateView.Loading())

            val burgers = getBurgersByNameUseCase.invoke(name)

            emit(StateView.Success(burgers))
        } catch (ex: HttpException) {
            val error = ex.getErrorResponse<ErrorResponse>()
            emit(StateView.Error(error?.message))
        } catch (ex: Exception) {
            ex.printStackTrace()
            emit(StateView.Error(ex.message))
        }
    }

}