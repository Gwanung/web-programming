<template>
    
    <transition name="fade">
      <Modal @closeModal="page=false" :oneroom="oneroom" :key="a" :click="click" :page="page"></Modal>
    </transition>

  <div class="menu">
    <a href="#" v-for="a in menu" :key="a">{{a}}</a>
  </div>

  <Discount @count="countData"></Discount>
  <button @click="priceSort">가격순정렬</button>
  <button @click="sortBack">되돌리기</button>
  <!-- props 에서 직접적인 자료형 입력이 가능해짐, 직접적인 내용도 작성이 가능함 => v_bind 필요없음 이런건 -->
  <Card :one_room="oneroom[i]" v-for="(a, i) in oneroom" :key="a" @openModal="page=true" :click="$event"></Card>
  
  
</template>

<script>
import data from './assets/oneroom.js';
import Discount from './Discount.vue';
import Modal from './Modal.vue';
import Card from './Card.vue';


export default {
  name: 'App',
  data() {
    return {
      click : 0,
      origin_oneroom : [...data],
      oneroom : data,
      page : false,
    }
  },
  methods: {


    priceSort(){
      this.oneroom.sort(function(a, b){
        return a.price - b.price
      })
    },
    sortBack(){
      // 원래 데이터로 변형 해주기
      this.oneroom = [...this.origin_oneroom];
    },
    countData(value){
      this.count = value;
    },
  },
  // mounted(){
  //   var test = setInterval(() => {
  //     this.count --;
  //     if(this.count == 0){
  //       clearInterval(test);
  //     }
  //   }, 1000);
  // },

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
.start{
  opacity: 0;
  transition: all 1s;
}
.end{
  opacity: 1;
}

.fade-enter-from{
  transform: translateY(-1000px);
}

.fade-enter-active{
  transition: all 1s;
}

.fade-enter-to{
  transform: translateY(0px);
}
</style>
