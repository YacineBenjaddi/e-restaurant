<h3> Formulaire de recherche </h3>
<form method="post" action="clientPoloniex_JDBC.php"> 
    <label> Designation </label>
    <input type="text" name="type" />
    <button type="submit" value="Poloniex" >Rechercher</button>
</form>





<?php 
//Pour execute ce client
//http://localhost/ClientPhp/client.php
if(isset($_POST['type'])){

  $idRech = $_POST['type'];
  try{

    $clt = new SoapClient(
    'http://localhost:1235/Poloniex?wsdl',
           array(
           'trace' => 1,
           'soap_version' => SOAP_1_1
           )
             );

             $params['type'] = $idRech;
        $res = $clt->__soapCall('ech', array($params));

        echo "<h3> Resultat de la recherche </h3>";
      echo"<ul>";
        echo "<li> NUM : " . $res->return->num ."</li>";
        echo "<li> Designation : " . $res->return->designation ."</li>"; 
        echo "<li> EURO : " . $res->return->EURO."</li>";
        echo "<li> USD : " . $res->return->USD."</li>";
     echo"</ul>";
 


  }
  catch (Exception $e){
    echo $e;
  }
}

 ?>