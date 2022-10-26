<template>
    <div class="black-bg" v-if="page ==true">
    <div class="white-bg">
      <img :src="oneroom[click].image" alt="">
      <h4>{{oneroom[click].title}}</h4>
      <p>{{oneroom[click].content}}</p>
      <!-- <input @input="month = $event.target.value" type="text"> -->
      <!-- 둘다 같은 의미 String 형태임 (숫자로적어도 -> '123') -->
      <!-- v-model.number 사용 시 숫자로 저장 가능 -->
      <input v-model="month" type="text">
      <p>{{month}}개월 선택함 : {{oneroom[click].price * month}}원</p>
      <button @click="$emit('closeModal')">닫기</button>
    </div>
  </div>
</template>

<script>

//대문자사용 props는 수정하면 안된다(재할당 x) 가져와서 page=false 이런식으로 수정하면 안됨!
export default {
    name: 'ThisModal',
    data(){
      return{
        month : 0,
        date : 123
      }
    }, 
    watch : {  //month 데이터가 변할때마다 watcher 실행
      month(a){
        if(isNaN(a) == true){ //숫자는 false , 문자는 true
          alert("값은 숫자만 입력하세요");
          this.month = 1;
        }
      },
    },
    props : {
      oneroom : Array,
      click : Number,
      page : Boolean,

    },
    beforeUpdate(){
      if(this.month == 2){
        alert("2개월은 안되요");
        this.month = 3;
      }
  },
}
</script>

<style>

</style>