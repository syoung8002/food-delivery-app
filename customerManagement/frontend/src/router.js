import Vue from 'vue'
import Router from 'vue-router'

import CustomerManagementOrderManager from "./components/listers/CustomerManagementOrderCards"
import CustomerManagementOrderDetail from "./components/listers/CustomerManagementOrderDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/customerManagements/orders',
            name: 'CustomerManagementOrderManager',
            component: CustomerManagementOrderManager,
        },
        {
            path: '/customerManagements/orders/:id',
            name: 'CustomerManagementOrderDetail',
            component: CustomerManagementOrderDetail,
        },
    ]
})
