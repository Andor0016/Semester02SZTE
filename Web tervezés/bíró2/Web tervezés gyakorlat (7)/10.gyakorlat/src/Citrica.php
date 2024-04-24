<?php

class Citrica
{
    private bool $bolyhos;
    private Narancs $sajatNarancs;

    /**
     * @param bool $bolyhos
     * @param Narancs $sajatNarancs
     */
    public function __construct(bool $bolyhos, Narancs $sajatNarancs)
    {
        $this->bolyhos = $bolyhos;
        $this->sajatNarancs = $sajatNarancs;
    }

    public function isBolyhos(): bool
    {
        return $this->bolyhos;
    }

    public function setBolyhos(bool $bolyhos): void
    {
        $this->bolyhos = $bolyhos;
    }

    public function getSajatNarancs(): Narancs
    {
        return $this->sajatNarancs;
    }

    public function setSajatNarancs(Narancs $sajatNarancs): void
    {
        $this->sajatNarancs = $sajatNarancs;
    }

    public function osztodik(Narancs $narancs){
        if(!$this->isBolyhos() && $this->isMagyar($narancs)){
            throw new CitricaException();
        }
        $newCat = new Citrica();
        $newCat->setBolyhos($this->bolyhos);

        $newCat->setSajatNarancs($this->sajatNarancs);
    }

    public function isMagyar(Narancs $narancs) : bool
    {
        if($narancs->getSargasag() < $this->sajatNarancs->getSargasag() &&
           $narancs->getSavanyusag() < $this->sajatNarancs->getSavanyusag())
        {
            return true;
        }
        return false;
    }
}