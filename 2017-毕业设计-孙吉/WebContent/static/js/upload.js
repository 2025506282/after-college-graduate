/**
 * Created by sunji on 2017/3/6.
 */
$(function() {
    $("#submit").click(function() {
    	var $chromosome =  $("#chromosome").val();
        var $authorName = $("#author_name").val();
        var $disease = $("#disease").val();
        var $authorInformation = $("#author_information").val();
        var $gene = $("#gene").val();
        var $title = $("#title").val();
        var $thesis = $("#thesis").val();
        var $pmId = $("#pm_id").val();
        var $doi = $("#doi").val();
        var isInsert = true;
//        if (!$authorName) {
//            $(".upload_author_name>span").html("Author name can not be null.");
//            isInsert = false;
//            setTimeout(function(){
//                $(".upload_author_name>span").html("");
//            },3000);
//        }
//        if (!$authorInformation) {
//            $(".upload_author_information>span").html("Author information can not be null.");
//            isInsert = false;
//            setTimeout(function(){
//                $(".upload_author_information>span").html("");
//            },3000);
//        }
        if (!$gene) {
            $(".upload_gene>span").html("Gene can not be null.");
            isInsert = false;
            setTimeout(function(){
                $(".upload_gene>span").html("");
            },3000);
        }
        if (!$title) {
            $(".upload_title>span").html("Title can not be null.");
            isInsert = false;
            setTimeout(function(){
                $(".upload_title>span").html("");
            },3000);
        }

        if (!$thesis) {
            $(".upload_thesis>span").html("Thesis can not be null.");
            isInsert = false;
            setTimeout(function(){
                $(".upload_thesis>span").html("");
            },3000);
        }
       
        if (!$pmId) {
            $(".upload_pm_id>span").html("PMID can not be null.");
            isInsert = false;
            setTimeout(function(){
                $(".upload_pm_id>span").html("");
            },3000);
        }
        if (isInsert) {
            $.post(
            		"http://localhost:8080/2017-毕业设计-孙吉/insertAsthma",
            		{
            			chromosome:$chromosome,
            			authorName:$authorName,
            			disease:$disease,
            			authorInformation:$authorInformation,
            			gene:$gene,
            			title:$title,
            			thesis:$thesis,
            			pmId:$pmId,
            			doi:$doi
            		},
            		function(data) {
            			alert(data);
            });
        } else {
        	alert("sorry");
        }
    });
    $("#reset").click(function() {
        $("#author_name").val("");
        $("#author_information").val("");
        $("#gene").val("");
        $("#title").val("");
        $("#thesis").val("");
        $("#pm_id").val("");
        $("#doi").val("");
    });

});
