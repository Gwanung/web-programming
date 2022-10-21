<template>

  <Modal :oneroom="oneroom" :p_number="p_number" :page="page"></Modal>
  <div class="menu">
    <a href="#" v-for="a in menu" :key="a">{{a}}</a>
  </div>

  <Discount></Discount>
  <!-- props 에서 직접적인 자료형 입력이 가능해짐, 직접적인 내용도 작성이 가능함 => v_bind 필요없음 이런건 -->
  <Card @openModal="page=true" :p_number="$event" :oneroom="oneroom"></Card>
  
</template>

<script>
// import apple from './assets/oneroom.js';
// import {apple} from './assets/oneroom.js';

import data from './assets/oneroom.js';
import Discount from './Discount.vue';
import Modal from './Modal.vue';
import Card from './Card.vue';


export default {
  name: 'App',
  data() {
    return {
      p_number : 0,
      oneroom : data,
      page : false,
      menu : ['Home', 'Product', 'About'],
      products : ['역삼동원룸', '천호동원룸', '마포구원룸'],

    }
  },
  methods : {
    increase(){
      this.number[0] += 1;
    }
  },

  components: {
    Discount,
    Modal,
    Card,
}
}
</script>

<style>
.room-img{
  width: 100%;
  margin-top: 40px;
}
body{
  margin: 0;
}
div{
  box-sizing: border-box;
}
.black-bg{
  width: 100%; height: 100%;
  background: rgba(0, 0, 0, 0.5);
  position: fixed; padding: 20px;
}
.white-bg{
  width: 100%; background: white;
  border-radius: 8px;
  padding: 20px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.menu{
  padding: 15px;
  border-radius: 5px;
  background-color: darkslateblue;
}
.menu a{
  color: white;
  padding: 10px;
  text-decoration: none;
}
.discount{
  background: #eee;
  padding: 10px;
  margin: 10px;
  border-radius: 5px;

}
</style>
