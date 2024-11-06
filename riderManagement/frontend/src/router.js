import Vue from 'vue'
import Router from 'vue-router'

import RiderManagementRiderManager from "./components/listers/RiderManagementRiderCards"
import RiderManagementRiderDetail from "./components/listers/RiderManagementRiderDetail"


Vue.use(Router);

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        { 
            path: '/riderManagements/riders',
            name: 'RiderManagementRiderManager',
            component: RiderManagementRiderManager,
        },
        {
            path: '/riderManagements/riders/:id',
            name: 'RiderManagementRiderDetail',
            component: RiderManagementRiderDetail,
        },
    ]
})
