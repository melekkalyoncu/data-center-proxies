#!/usr/bin/env node
require('request-promise')({
   url: 'https://ifconfig.co/ip',
   proxy: 'http://username:pass@1.1.1.1:60000'
 }).then(function(data){ console.log(data); }, function(err){ console.error(err); });
