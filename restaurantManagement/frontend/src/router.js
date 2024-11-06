import Vue from 'vue'
import Router from 'vue-router'

import RestaurantManagementRestaurantManager from "./components/listers/RestaurantManagementRestaurantCards"
import RestaurantManagementRestaurantDetail from "./components/listers/RestaurantManagementRestaurantDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/restaurantManagements/restaurants',
            name: 'RestaurantManagementRestaurantManager',
            component: RestaurantManagementRestaurantManager,
        },
        {
            path: '/restaurantManagements/restaurants/:id',
            name: 'RestaurantManagementRestaurantDetail',
            component: RestaurantManagementRestaurantDetail,
        },
    ]
})
