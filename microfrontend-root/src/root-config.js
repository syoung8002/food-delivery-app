import { registerApplication, start } from 'single-spa';
import {
  constructApplications,
  constructRoutes,
  constructLayoutEngine,
} from 'single-spa-layout';

const routes = constructRoutes(`
<single-spa-router mode="hash" base="/">
  <route default>
    <application name="@my-app/home"></application>
  </route>
  <route path="customerManagements">
    <application name="@my-app/customer-management"></application>
  </route>
  <route path="restaurantManagements">
    <application name="@my-app/restaurant-management"></application>
  </route>
  <route path="riderManagements">
    <application name="@my-app/rider-management"></application>
  </route>
</single-spa-router>
`);

const applications = constructApplications({
  routes,
  loadApp({ name }) {
    return System.import(name);
  },
});

const layoutEngine = constructLayoutEngine({ routes, applications });

applications.forEach(registerApplication);
layoutEngine.activate();
start();