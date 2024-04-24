<?php

class Pap
{
    private int $turelem;
    private bool $el;

    /**
     * @param int $turelem
     */
    public function __construct(int $turelem)
    {
        $this->setTurelem($turelem);
        $this->setEl(true);
    }

    public function getTurelem(): int
    {
        return $this->turelem;
    }

    public function setTurelem(int $turelem): void
    {
        $this->turelem = max(0,$turelem);
    }

    public function isEl(): bool
    {
        return $this->el;
    }

    public function setEl(bool $el): void
    {
        $this->el = $el;
    }

    public function meghal(){
        if($this->el == false){
            return Exception;
        }
        $this->el = false;
    }

    public function narancsotAd(): ?Narancs
    {
        if(!$this->el || $this->turelem == 0){
            return null;
        }
        return new Narancs($this->randomNumber(),$this->randomNumber());
    }

    private function randomNumber(){
        return rand() / getrandmax();
    }


}