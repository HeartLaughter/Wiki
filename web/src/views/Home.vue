<template>
 <a-layout>
   <a-layout-sider width="200" style="background: #fff">
     <a-menu
         mode="inline"
         v-model:selectedKeys="selectedKeys2"
         v-model:openKeys="openKeys"
         :style="{ height: '100%', borderRight: 0 }"
     >
       <a-sub-menu key="sub1">
         <template #title>
              <span>
                <user-outlined />
                subnav 11111
              </span>
         </template>
         <a-menu-item key="1">option1</a-menu-item>
         <a-menu-item key="2">option2</a-menu-item>
         <a-menu-item key="3">option3</a-menu-item>
         <a-menu-item key="4">option4</a-menu-item>
       </a-sub-menu>
       <a-sub-menu key="sub2">
         <template #title>
              <span>
                <laptop-outlined />
                subnav 2
              </span>
         </template>
         <a-menu-item key="5">option5</a-menu-item>
         <a-menu-item key="6">option6</a-menu-item>
         <a-menu-item key="7">option7</a-menu-item>
         <a-menu-item key="8">option8</a-menu-item>
       </a-sub-menu>
       <a-sub-menu key="sub3">
         <template #title>
              <span>
                <notification-outlined />
                subnav 3
              </span>
         </template>
         <a-menu-item key="9">option9</a-menu-item>
         <a-menu-item key="10">option10</a-menu-item>
         <a-menu-item key="11">option11</a-menu-item>
         <a-menu-item key="12">option12</a-menu-item>
       </a-sub-menu>
     </a-menu>
   </a-layout-sider>
   <a-layout style="padding: 0 24px 24px">

     <a-layout-content
         :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
     >
       Content
     </a-layout-content>
   </a-layout>
 </a-layout>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import HelloWorld from '@/components/HelloWorld.vue';
import {LaptopOutlined, NotificationOutlined, UserOutlined} from "@ant-design/icons-vue"; // @ is an alias to /src

export default defineComponent({
  name: 'Home',
  components: {
    LaptopOutlined, NotificationOutlined, UserOutlined,
    HelloWorld,
  },
});
</script>
