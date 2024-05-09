<?php 
    function belepo($str){
        if (!is_string($str)) {
            return null;
        }
        $trimStr = trim($str);
        return $trimStr === $str;
    }

    function lakat($lakat, $zar){
        if($lakat == $zar && $lakat !== $zar){
            return true;
        }
        return false;
    }

    function belepojegy($ar, $emberek = 1){
        if(gettype($emberek) != "integer"){
            return null;
        } else {
            return $ar * $emberek;
        }
    }

    function allatok($allatok){
        $allatokString = implode(', ', $allatok);
        return "Az allatkert allatai: " . $allatokString . ".";
    }

    function nyilvantartas($nevek, $mennyisegek, $tipusok){
        if(count($nevek) != count($mennyisegek) || count($mennyisegek) != count($tipusok) || count($nevek) != count($tipusok)){
            return null;
        }
        $tomb = [];
        for ($i=0; $i < count($nevek); $i++) { 
            $ujAllat = [
                "nev" => $nevek[$i],
                "darab" => $mennyisegek[$i],
                "tipus" => $tipusok[$i],
            ];
            array_push($tomb, $ujAllat);
        }
        return $tomb;
    }

    function kobold_harc($koboldok){
        if(count($koboldok) % 2 != 0){
            return null;
        }
        sort($koboldok);
        $output = [];
        for ($i=0; $i < count($koboldok); $i += 2) { 
            $str = $koboldok[$i] . " vs " . $koboldok[$i+1];
            array_push($output, $str);
        }
        return $output;
    }

    function fonixek($fajlcim){
        $fajl = fopen($fajlcim, "r");
        while (($line = fgets($fajl)) !== FALSE) {
            $allapot = explode(";", $line)[0];
            $nap = explode(";", $line)[1];
            if($allapot == 'HAMU' && $nap >= 7){
                $sum++;
            }
        }
        return $sum;
    }

    function vizihalak($filenev, $halak){
        $file = fopen($filenev, "w");
        if ($file) {
            sort($halak);
            $halak = array_reverse($halak);
            foreach ($halak as $hal) {
                fwrite($file, $hal . "\n");
            }
            fclose($file);
        }
    }
?>