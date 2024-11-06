<template>
    <v-container fluid>
        <div style="width:100%; margin:0px 0px 20px 0px; position: relative;">
            <v-img style="width:100%; height:300px;"
                src=""
            ></v-img>
            <div class="App-main-text-overlap">
                
            </div>
            <div class="App-sub-text-overlap">
                
            </div>
        </div>
        <v-row>
            <v-col v-for="(aggregate, index) in aggregate" 
                    :key="index"
                    cols="4"
                    class="d-flex justify-center" 
            >
                <div 
                    class="flip-card"
                    @mouseover="flipCard(index)"
                    @mouseleave="unflipCard(index)"
                    :class="{ 'is-flipped': flipped[index] }"
                >
                    <div class="flip-card-inner">
                        <div class="flip-card-front">
                            <v-card
                                class="mx-auto"
                                style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                outlined
                            >
                                <v-list-item style="padding:15px; margin:0px;">
                                    <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                </v-list-item>
                                <div style="text-align: left; padding:10px 15px 15px 15px; margin-top:-10px;">
                                    <h2>{{ aggregate.title }}</h2>
                                    <div>{{ aggregate.description }}</div>
                                </div>
                            </v-card>
                        </div>
                        <div class="flip-card-back">
                            <v-card
                                color="primary"
                                class="mx-auto"
                                style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                outlined
                                :key="aggregate.key"
                                :to="aggregate.route"
                            >
                                <v-list-item style="padding:15px; margin:0px;">
                                    <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                </v-list-item>
                                <h2 style="color:white;">{{ aggregate.title }} 관리</h2>
                            </v-card>
                        </div>
                    </div>
                </div>
            </v-col>
        </v-row>
    </v-container>  
</template>

<script>
export default {
    name: "Home",
    data: () => ({
        flipped: [],    
        aggregate: [
            { 
                title: '주문', 
                description: '주문에 대한 정보를 포함합니다.', 
                key: 'orders', 
                route: '/customerManagements/orders',
                ImageUrl: '',
            },
            { 
                title: '음식점', 
                description: '음식점에 대한 정보를 포함합니다.', 
                key: 'restaurants', 
                route: '/restaurantManagements/restaurants',
                ImageUrl: '',
            },
            { 
                title: '라이더', 
                description: '라이더에 대한 정보를 포함합니다.', 
                key: 'riders', 
                route: '/riderManagements/riders',
                ImageUrl: '',
            },
        ],
    }),
    methods: {
        flipCard(index) {
            this.$set(this.flipped, index, true);
        },
        unflipCard(index) {
            this.$set(this.flipped, index, false);
        },
    }
}
</script>

<style>
</style>
