package com.example.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by EUNICE BAKARE T. on 11/03/2022
 * Email: eunice@reach.africa
 */

@Parcelize
data class Meal(
    val id: String,
    val mealName: String,
    val mealImg: String,
    val drink: String?="",
    val mealCategory: String?="",
    val mealArea: String?="",
    val mealSteps: String?="",
    val mealTags: String?="",
    val mealVideo: String?="",
    val ingredientOne: String?="",
    val ingredientTwo: String?="",
    val ingredientThree: String?="",
    val ingredientFour: String?="",
    val ingredientFive: String?="",
    val ingredientSix: String?="",
    val ingredientSeven: String?="",
    val ingredientEight: String?="",
    val ingredientNine: String?="",
    val ingredientTen: String?="",
    val ingredientEleven: String?="",
    val ingredientTwelve: String?="",
    val ingredientThirteen: String?="",
    val ingredientFourteen: String?="",
    val ingredientFifteen: String?="",
    val ingredientSixteen: String?="",
    val ingredientSeventeen: String?="",
    val ingredientEighteen: String?="",
    val ingredientNineteen: String?="",
    val ingredientTwenty: String?="",
    val measureOne: String?="",
    val measureTwo: String?="",
    val measureThree: String?="",
    val measureFour: String?="",
    val measureFive: String?="",
    val measureSix: String?="",
    val measureSeven: String?="",
    val measureEight: String?="",
    val measureNine: String?="",
    val measureTen: String?="",
    val measureEleven: String?="",
    val measureTwelve: String?="",
    val measureThirteen: String?="",
    val measureFourteen: String?="",
    val measureFifteen: String?="",
    val measureSixteen: String?="",
    val measureSeventeen: String?="",
    val measureEighteen: String?="",
    val measureNineteen: String?="",
    val measureTwenty: String?="",
    val mealSource: String?="",
    val mealImgSource: String?=""
): Parcelable
