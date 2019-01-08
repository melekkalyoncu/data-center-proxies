<?php
 $curl = curl_init('https://ifconfig.co/ip');
 curl_setopt($curl, CURLOPT_PROXY, 'PROXY:PORT');
 curl_setopt($curl, CURLOPT_PROXYUSERPWD, 'username:pass');
 curl_exec($curl);
 ?>
