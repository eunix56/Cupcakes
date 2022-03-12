package com.example.domain.repository

import com.example.domain.model.Meal
import kotlinx.coroutines.flow.Flow


/**
 * Created by EUNICE BAKARE T. on 05/03/2022
 * Email: eunice@reach.africa
 */
interface MealRepository {
    suspend fun fetchMeals(value: String): Flow<List<Meal>>

    suspend fun fetchCategoryMeals(category: String): Flow<List<Meal>>

    suspend fun fetchIngredientMeals(ingredient: String): Flow<List<Meal>>
}