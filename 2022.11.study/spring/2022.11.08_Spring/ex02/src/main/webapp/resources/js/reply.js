//console.log("Reply Module........");

var replyService = (function(){
	
	function add(reply, callback, error){
		console.log("add reply.............");
		$.ajax({
			type : 'post',
			url : '/replies/new',
			data : JSON.stringify(reply),
			//데이터 전송 방식
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr){
				if (callback)
					callback(result);
			},
			error : function(xhr, status, er){
				if (error)
					error(er);
			}
		});
	}//end add
	
	function getList(param, callback, error){
		var bno = param.bno;
		var page = param.page || 1;
		
		$.getJSON("/replies/pages/" + bno + "/" + page + ".json",
			function(data){
				if (callback)
					//callback(data); // 댓글 목록만 가져오는 경우
					callback(data.replyCnt, data.list);
			}).fail(function(xhr, status, err){
				if (error)
					error();
			});
			
	}//end getList
	
	function remove(rno, callback, error){
	
		$.ajax({
			type : 'delete',
			url : '/replies/' + rno,
			success : function(result, status, xhr){
				if (callback)
					callback(result);
			},
			error : function(xhr, status, er){
				if (error)
					error(er);
			}
		});
		
	}//end remove
	
	function update(reply, callback, error){
	
		$.ajax({
			type : 'put',
			url : '/replies/' + reply.rno,
			data : JSON.stringify(reply),
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr){
				if (callback)
					callback(result);
			},
			error : function(xhr, status, er){
				if (error)
					error(er);
			}
		});
	}//end update(댓글 수정)
	
	function get(rno, callback, error){
		$.get("/replies/" + rno + ".json", function(result){
			if (callback) 
				callback(result);
		}).fail(function(xhr, status, err){
			if (error)
				error();
		});
	}//end get(댓글 조회)
	
	function displayTime(timeValue){
		
		var today = new Date();
		
		var gap = today.getTime() - timeValue;  // 날짜 차이 계산 (항상 양수) , 하루가 지나면 날짜 표시하고 ,24시간 이내면 시간으로 표시!
		
		var dataObj = new Date(timeValue);
		var str = "";
		
		if (gap < (1000 * 60 * 60 * 24)){ //하루가 지나지 않았으면 시간으로
		
			var hh = dataObj.getHours();
			var mi = dataObj.getMinutes();
			var ss = dataObj.getSeconds();
			
			return [(hh > 9 ? '' : '0') + hh, ":", (mi > 9 ? '' : '0') + mi, ":", (ss > 9 ? '' : '0') + ss ].join('');
			//구분자를 :로 설정 시:분:초(01:01:01 or 11:11:11)
			
		}else{ //하루가 지났으면 날짜로
			
			var yy = dataObj.getFullYear();
			var mm = dataObj.getMonth() + 1; // getMonth() is zero-based
			var dd = dataObj.getDate();
			return [ yy, "/", (mm > 9 ? '' : '0') + mm, "/", (dd > 9 ? '' : '0') + dd ].join('');
			//구분자를 /로 설정 년/월/일 
		
		}
	
	
	
	}//end displayTime
	

	return {add : add, getList : getList, remove : remove, update : update, get : get, displayTime : displayTime};

})();
 
