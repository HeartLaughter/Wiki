<template>
  <a-layout-footer style="text-align: center">
    Ant Design ©2018 Created by Ant UED11
  </a-layout-footer>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'the-footer',
  props: {
    msg: String,
  },
});
</script>

