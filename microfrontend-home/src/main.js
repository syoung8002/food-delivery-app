 /*eslint-disable*/
import Vue from "vue";
import singleSpaVue from "single-spa-vue";

import App from "./App.vue";
import router from "./router";
import vuetify from "./plugins/vuetify";



Vue.config.productionTip = false;

require('./GlobalStyle.css');

const vueLifecycles = singleSpaVue({
  Vue,
  appOptions: {
    vuetify: vuetify,
    router,
    render: h => h(App),
  }
});

export const bootstrap = vueLifecycles.bootstrap;
export const mount = vueLifecycles.mount;
export const unmount = vueLifecycles.unmount;
