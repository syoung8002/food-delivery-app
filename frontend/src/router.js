
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerManagementOrderManager from "./components/listers/CustomerManagementOrderCards"
import CustomerManagementOrderDetail from "./components/listers/CustomerManagementOrderDetail"

import RestaurantManagementRestaurantManager from "./components/listers/RestaurantManagementRestaurantCards"
import RestaurantManagementRestaurantDetail from "./components/listers/RestaurantManagementRestaurantDetail"

import RiderManagementRiderManager from "./components/listers/RiderManagementRiderCards"
import RiderManagementRiderDetail from "./components/listers/RiderManagementRiderDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customerManagements/orders',
                name: 'CustomerManagementOrderManager',
                component: CustomerManagementOrderManager
            },
            {
                path: '/customerManagements/orders/:id',
                name: 'CustomerManagementOrderDetail',
                component: CustomerManagementOrderDetail
            },

            {
                path: '/restaurantManagements/restaurants',
                name: 'RestaurantManagementRestaurantManager',
                component: RestaurantManagementRestaurantManager
            },
            {
                path: '/restaurantManagements/restaurants/:id',
                name: 'RestaurantManagementRestaurantDetail',
                component: RestaurantManagementRestaurantDetail
            },

            {
                path: '/riderManagements/riders',
                name: 'RiderManagementRiderManager',
                component: RiderManagementRiderManager
            },
            {
                path: '/riderManagements/riders/:id',
                name: 'RiderManagementRiderDetail',
                component: RiderManagementRiderDetail
            },



    ]
})
