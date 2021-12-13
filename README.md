# Master-Desarrollo-2020-2021.-Proceso-de-Desarrollo-Agil

### Se ha partido de la versión pm.basic de modelViewPresenter/presentationModel, y se ha hecho refactoring hasta llegar a la versión withFacade

![Punto de partida](https://www.plantuml.com/plantuml/svg/VP71QiCm38RlUWh1Bkr6_01Xb48FkuOjxEuweXYSkDZEniZwxajSZ3B7syLrzKc_Vlyv-Y1T67i347GmXCqu18iTuNMkwquAR7fnbbuh07dsmKaLK1dfFRPQjLArbd02H7oO4hyfHpBGkwRFtRx6vJSsN8tysktX1X058i29_v_iuAsXjUul69mrXjnztTE5miaQwtRAMjVfGGQQbyNICiKgpzzLjT5UDpnMrG5VP4yrNkOp8z5cZH_pcPEt9JmsbkDcVk_Vz9NysDEA0z-Zvrm-vxb-ZlzTa9uCi4bTY4EAAtuwM4vECPLNToo4aVFSROvBRhc3uyvtSzHRmhgHGH8e6quQ9RUiKZRBmqBSXyd5dNmjoHvfwCRU_000)

![Se añade propiedad Logic](https://www.plantuml.com/plantuml/svg/TP6nQiCm48PtFSL1bwJ5XgwXX426BXrA4x9Vv2EeoBuWoIrfceVgC_J5QiiOYRExoEVxfF__TThuW2wqjLKgc6093eybx0ZmzmShWhFZiw4AAx1yCXeGzaRlKU-Pu0AUm3H66xJc2y6tmCTt2WpK05dGtFZWMXtOAON7haOTG5lqFbEvAW2ukuxyfXrXe8EXpyLo1VqtRZXRl2oMwgPK58W0hkb_svcnfLmtmPS-kzWT75jBRl1_E57OicMtqCokCWq6wjnZgp-LP9--Ys9Ybl7xebWFVafsdx6c5PowLP1ucHLyTAiak_vrKbg9NorU_gTlvDkQCgvI7IyYvIMN-X9F3OP9ZxVD3VEcVAkoN8ypZG-k-dMmoDjP3NF3aLoc5tYQFj-HnY-zq-Yd9Eb6faQ1-S23ndpQf38VDXqko-4mkUYPoZbPjQ6cQclx1m00)

![Se añada parametro logic a createView](https://www.plantuml.com/plantuml/svg/TPB1IWCn48RlUOe1BwsoU_1Of5HwyE91jFG-faDPo6vAabLaxSFu23v3NypDXcN2D5v2Eb_c_sV-xiO7TA5lZGfDC0Jx-neUBxzui712T_bfAJWBp_ROQ43GZZ3Glg5FfV3T1uSwW3ReFUmQlKEzimI30e2ROUPdRbea7HFFvGfYQNfxClYrMAgpKaah0XZuzzPstXhABHXEck9rSDOOSccKkoE5hJNMBRIrxj1q66XqdqgnYsKVlglgoYpZjrMrJdvALf-mfHKSnrEIkCmAFiPJahSOFKyhySkOol_qbNpVKiOLtzCYGbvoeIznmI0bFM-R6-P5-L_LzNhED7quyKmMUJcxGo4SoSNq0fVZuHSSl_JcwAy9wwP5Pe7om4cZF2shb8VbvhfEpUGcJxwMP3VK7VhM_040)

![A la logica se añaden 3 propiedades correspondientes a los 3 controladores](https://www.plantuml.com/plantuml/svg/VP71IWCn48RlynG3NbfbU-cjIAdquCM3QEazpGuba4sM95LaxGDvz1dwOYODIvOnUWd9V9D__fdP-21SE7KQ8AYW2VVB1JwW5gZjKKc1GNG7TVaow0aZ5fTlqPA92HwNs3lRAsfZnAEqpf7lhMaLcH03II8bIMk2irgqDd8440SVd901PHJnk5Do9-JE4Ww0Y3V3oC_IaGYqL_G-UqfcigNv2bFecjjhyJ6RmnaWQoM0GtblhV5MqxH4WLbpcfsDQdBPojsHmjPgwsRIMjSg8mB5wjTG-bLaxp-RvbUn2RzjcdMk1ppwA3fQuJ6UdAHcLlWMJqvUqywAMuwVurJ-fY_aJnrDE9HxReJ9SyxrEVwtmDWoG1u_UzVxAuZNBgHQbcr_iLYFMqh31KZdkBmIdjonPeTpFW-6QyPAHccOrouDrqdMpOsC0dN3MQFkjgZKpPRFQNhfGIuzeLnhih0Xqvuw_GC0)

![Métodos de fachada en la lógica](https://www.plantuml.com/plantuml/svg/VLDDRnCn4BtxLup49O5cJvmYLBMWYWke5Qnw7xpJOE5THsDle0hzGVmE_XZ-IEFLoFHYpRxdUU-DxRto0JdCerN114jm_xQ3cmaiWdKxen6q6yn3B4Rd8-HX_Fidk24M0y43wkyu8EoH4UuiFX9_S5DWPotn1NnDqXM0H_X2VXwfGahXDnyOTG1jqNleZUvHzuxWg03WrV6PVz9C6EZUqC_LfvIiv5jl8K5vxpu6MAtLar95An5mhD_HrZjBIujAPirY-cP7CRLrlDBEyM0c3BJE139TMzkx7pJvs-czGnvMXJ7-B7j29leLIfdqhdKm1ogg1TpF8Gj9axJxxiJTC3TIZEv0fTMnsPdf0W9ox3gttsRuSzmcL8HDdzl4lfOcawUmFDfwWoySsHOobBhgcR_xlTc0l8a5_tgpkIoNeIJw4KVQmYwkaaatlOL3N0KZdw2aqvlzBzjuhRKkWqXvoGjzIRzey3ooKlauv7Txlaf9xyeqRSMlqNMNS0Bp_wNIMa8luKKDhJYI5vaatGfMTzI1fNSTkCqKtJB8MQ0Pk6YqqrQLTjZQt7MbcJXxrh8bUqNJC8_s7m00)

![Constructores que aceptan Logic](https://www.plantuml.com/plantuml/svg/VLH1RrCn3BxdLrZYqiBQ6vSAJHiLuWBQ1DNkMMfLWRoaE7c5gUo_qyHh_MI5NIBd--pFdrFttUHYgOn3CARu4X0UtYzXJMY7b66Cu5BCXKPN4a56DyQj9Py08wnFJ0huuF7t5V3vlMfnU1_iaqH8DOOd-8Pv7B1TzfOi_1eHhCDzmLYxfSSVM19i4O855sn6-99stXbZ7tCXwqf3CsoysrYtIGX70m1lZcV-sH7QqZhCMYc4UivNpMBBtPyCpURcsHZMQcwESkV1SDf2IDPiJT_jiAnJI3HpAT7MHrjmtWXBU1l29lt4cE_YnsHfEsF6vuli2nBnJ-6mwjswuW_8gWpknzA4T9EQVV_2VIBgk1ZI0RaqaT_vU0N5qgdgKdxNuA-SrbNXl4qhKtazJSACTPZfKnPA8I2zycGhQ52jaZV_y7UnqBy4JlYtYyNrUJSK-jaEk8BTwTHC_QLNS3YTYk7D5RUQhZlyVvQNUi8RYNaG9QzvfQ_frnkSHpQ6TrFVk_C99Rqrqssh_XhBvVNqGs1CFTdq59x4qB6ZUEL9qtrZaY43wzuoS9zXNHxa8j0rp1fzjwBIDol5zVNaysWaxCbEMTbzCS-0s1QG6ogCRMdKc1kCst48_m00)

![Se crea clase WithLogicView](https://www.plantuml.com/plantuml/svg/VPD1RrCn3CVl-HIMk7JGziYXGjD6XRY0Da4rpk7LAX5vyPJa5QRI3yDduCQrNup6wUetA-nIEVxPVzlFxbNADkQXzoQxx17kNizXIJt1dSCVK_XSQ3LllNqG2sEnuG4-OHfwv4UcDIN0b0-_0zX4dRF5OS5Ry8S_6zVPAII4BgA58LZel2rFwWz_0tnn-Ti7EWOLBMFirvIZxJ879LYvRcMx5I7i302ys3toVL7BtC24qy6Ntui5Jy2nzyT-9nTcRmnhCO2Tl9SK4daSbn38chNegmtc9NcAauuehbsm6IyOs8ZNtg_eEuPq4zwIZUj99IwTPK-UW3ypcwnttMMtnQfQdVT3PY5LXADlJ-nTZ8qkUjfYJQNeDYvC8Tjup3gdtx3xOmrhgt3SYjDKN4ipOi8opFXJvaZUOtpcaos0NMQlj_pq1awR7YsrP3mDcSqkWL_A_-RNR7Q-s0QJmsv1kUaMbVDlKVORkILswWiRyPSoWlQ-jpqkO6Dx7Sz55h0z_ch2SyaM5ERU_q_ht2DknEP1jBpcMb_XvmiyZcnCNRbwj-SJf6iBQPNLV_dv_19Ephf1sUZOFRAXrOxYgYU5sur9X0oiQyl0JJ8-O7CMQ3PSDThTYagxMKakNs_qjn2p9Nk5OJtq_Xy0)


![Sobrecarga Método write de BoardView](https://www.plantuml.com/plantuml/svg/VLJDRXCn4BxxAKRYaa2JArA4gfQguW9g1L4vJvtHOk5T1zkRWa8VYEVWnUYEcumPERsjvvlvlcz-aekKCUQnzoQxx0dktYxXUe3t0UFcpj43988KxYDPZ1r26g7_-oU7JO27w3ATmHOZme-H02rjCu57yA5p5et1-vGZsWpMOqgmTdQDTXq8zWO0NkqF-AEDX9ackTd7gROmp5SmXJXtw_7NR6uUZM4k1c0lxwimfE2fbX2mSBBecuxoLV0Xpcm8SUC6p3Hd02DTUhyEtsb8DmFtFok8IqVQvyX0FpD_Cj-bpMv7XRK4jsDc8YN2sRVFs7MC3HTzs54f3T5rRZY3ZF6fwbX-m-5FdDPcANbhBbDvBSv8YQPcwb7c6Bod-CB8Li2XgKfj-QlBttZWPKMylMgfeYCdLcJudcPVfdCK2_CAOXOs-h_6Od4E_5BnTxyN2xXzEfpfrS9OwnJucTBOKurgMegdK8uREKOEwXEjyDVIWev-m9vMq66lyrba1Rj9IY5gXWfcxwVHqdU56_cknYP1ZMj-3RyeS6ZP61w7VhVx4qYqDTAKLVyPo-NvOKjbWxBHEbnzGykEnfKd3RUCIOOqhBMbuJPI7R0v4ZGD5uwsMs5fcvNYQNhLpq8-6xJYYElaly1SqB0PU_yF)


![Sustitución de controladores](https://www.plantuml.com/plantuml/svg/VLJFJXi_4BxxAKRwNS8F4gctAgeGb28kRK4bekhHUAV1gjSEOoyqIdcWddc4l5YzuoHsh0sNbMU-cU-RF_QU-I0fTAqHGGU3SFT-0hUTZqQdzFhLGeDWNNjFwFkZSZQGCx9n10j7O2GODzTAJeImBY183r_V2G2uj17nqAx_1jSuJhxjfUuqFf_0D_HTY-cyX1iZb-dSPte4dofO8g3Po4S2CoY_VcLzJlq1QE72MUyCphIQIJLp60MkI2uUjF8xtqwfyn8IiG_KgU0e2cqekBuYkpSvxx5385Jw7lSg-8GGUvKUq8VuLKPwzBq86jrgApbNTT8yTXe927yYeLLQWkHP5TsXdmYq3VGp5KBU-q1I1QRqa3jRzOp_hRRuYoAKWSiUVUxNafPpD8NUnR6BEEhHaNWHWhaOW5Msw-55B8E9aqMFvnWkd74qKivHewqCUCI093mtPkP-eVNNzgEJr8mIelFyDnwBlmCVcUzS1Vs4YJKv5rrWeag4esyss2NHG1MjUyAKwaZFjJs182bcxTAlsVs5mqgMMcR6QLNS42UXnr2EzYAjqo2zCR8fi2jcrLl-hiC33pojYBTNB3Nhy8XpqF4pwO1f_rpDFj5uV0fiLVuFVyRZtKCSmFBh7GBpUpv4YtG8PR_8DuwTzJqiyFzp2xNtIhOuXNdyLWYBJE4fVck4-ygxgc2k_J2Q-YvmaS_SI4rVupL_3Ryfi6rP21v7RG_tbw6iNID3ijL2O38vBV-JGkIDxhaBeoY8iHhYWeQHue89iGtZ6ehB9PXwY-I78SxGDbrh_W40)
