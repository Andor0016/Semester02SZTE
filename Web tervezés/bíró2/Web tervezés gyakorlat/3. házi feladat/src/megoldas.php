<?php
    function hozzavalok_szama($hozzavalo_lista){
        return count($hozzavalo_lista);
    }

    function legnagyobb_mennyiseg($beszerzo_lista){
        $legnagyobb_ertek = 0;
        $legnagyobb_neve = null;

        foreach($beszerzo_lista as $nev => $mennyiseg){
            if($mennyiseg > $legnagyobb_ertek){
                $legnagyobb_ertek = $mennyiseg;
                $legnagyobb_neve = $nev;
            }
        }
        return $legnagyobb_neve;
    }

    function hozzavalok_beszerzese($szukseges_hozzavalok, $talalt_noveny){
        foreach($szukseges_hozzavalok as $szukseges_noveny){
            if($szukseges_noveny == $talalt_noveny){
                return true;
            }
        }
        return false;
    }

    function rendszerezes($novenyek){
        $darabolt_szoveg = explode(";", $novenyek);
        $rendszerezett_novenyek = array();

        foreach ($darabolt_szoveg as $noveny){
            if(!isset($rendszerezett_novenyek[$noveny])){
                $rendszerezett_novenyek[$noveny] = 0;
            }
            $rendszerezett_novenyek[$noveny] ++;
        }

        return $rendszerezett_novenyek;
    }

    function varazslat_elokeszitese($vizsgalando_szoveg){
        $feldolgozott_szoveg = strtolower($vizsgalando_szoveg);
        for($i=1; $i<strlen($feldolgozott_szoveg); $i++){
            if($feldolgozott_szoveg[$i] == $feldolgozott_szoveg[$i-1]){
                return true;
            }
        }
        return false;
    }

    function fozes(&$ust_tartalma, $hozzavalo){
        $ust_tartalma[] = $hozzavalo;
    }
?>