#!/usr/bin/ruby

require 'uri'
require 'net/http'

uri = URI.parse('https://ifconfig.co/ip')
proxy = Net::HTTP::Proxy('1.1.1.1:60000', 'username', 'pass')

req = Net::HTTP::Get.new(uri.path)

result = proxy.start(uri.host,uri.port) do |http|
    http.request(req)
end

puts result.body
