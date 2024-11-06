<template>
    <v-card outlined>
        <v-card-title>
            ReceiveFood
        </v-card-title>

        <v-card-text>
            <String label="RiderId" v-model="value.riderId" :editMode="editMode"/>
            <String label="RestaurantId" v-model="value.restaurantId" :editMode="editMode"/>
            <String label="OrderId" v-model="value.orderId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="receiveFood"
            >
                ReceiveFood
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
        name: 'ReceiveFoodCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.riderId = '';
            this.value.restaurantId = '';
            this.value.orderId = '';
        },
        watch: {
        },
        methods: {
            receiveFood() {
                this.$emit('receiveFood', this.value);
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

