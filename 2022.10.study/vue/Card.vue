<template>
   <div v-for="(a,i) in oneroom" :key="i">
    <img :src="a.image" alt="" class="room-img">
    <h4 @click="$emit('openModal', oneroom.id)" p_number= "i">{{a.title}}</h4>
    <p>{{a.price}}원</p>
  </div>
</template>

<script>
export default {
    name : 'ThisCard',
    props : {
    oneroom : Array,
    p_number : Number,    
    }
}
</script>

<style>

</style>