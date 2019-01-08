<?php
 $curl = curl_init('https://ifconfig.co/ip');
 curl_setopt($curl, CURLOPT_PROXY, '1.1.1.1:60000');
 curl_setopt($curl, CURLOPT_PROXYUSERPWD, 'username:pass');
 curl_exec($curl);
 ?>
