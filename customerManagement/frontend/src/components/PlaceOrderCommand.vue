<template>
    <v-card outlined>
        <v-card-title>
            PlaceOrder
        </v-card-title>

        <v-card-text>
            <String label="FoodType" v-model="value.foodType" :editMode="editMode"/>
            <int offline label="Quantity" v-model="value.quantity" :editMode="editMode" @change="change"/>
            <String label="Content" v-model="value.content" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="placeOrder"
            >
                PlaceOrder
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'PlaceOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.foodType = '';
            this.value.quantity = {};
            this.value.content = '';
        },
        watch: {
        },
        methods: {
            placeOrder() {
                this.$emit('placeOrder', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

