<?php

require_once 'DB_functions.php';

$db = new DB_Functions();

/*
* EndPoint: http://<domain>/drinkshop/checkuser.php
  Mehod: POST
  Params: Phone
  Result: Json
*/

$response = array();
    if(isset($_POST['phone'])){
        $phone = $_POST['phone'];
        if($db->checkExistsUser($phone)){
            $response["exists"] = true;
            echo json_encode($response);
        }else{
            $response["exists"] = false;
            echo json_encode($response);
           
        }
    }else{
        $response["error_msg"]="Required Parameter (phone) is missing!";
        echo     json_encode($response);
    }

?>