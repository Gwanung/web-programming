<template>
    <div class="black-bg" v-if="page ==true">
    <div class="white-bg">
      <img :src="oneroom[p_number].image" style="width:50%">
      <h4>{{oneroom[p_number].title}}</h4>
      <p>{{oneroom[p_number].content}}</p>
      <p>{{oneroom[p_number].price}}원</p>
      <!-- <button @click="page= false">닫기</button> -->
    </div>
  </div>
</template>

<script>
export default {
    name: 'ThisModal',
    props : {
      //대문자사용 props는 수정하면 안된다(재할당 x) 가져와서 page=false 이런식으로 수정하면 안됨!
      
      oneroom : Array,
      p_number : Number,
      page : Boolean,

    }
}
</script>

<style>

</style>