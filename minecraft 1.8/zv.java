/*  1:   */ import java.util.Iterator;
/*  2:   */ import java.util.List;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class zv
/*  6:   */   extends zb
/*  7:   */ {
/*  8:   */   private agp a;
/*  9:   */   private xm b;
/* 10:   */   private double c;
/* 11:   */   private int d;
/* 12:   */   
/* 13:   */   public zv(agp paramagp, double paramDouble)
/* 14:   */   {
/* 15:18 */     this.a = paramagp;
/* 16:19 */     this.c = paramDouble;
/* 17:20 */     a(1);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a()
/* 21:   */   {
/* 22:25 */     if (this.a.l() >= 0) {
/* 23:26 */       return false;
/* 24:   */     }
/* 25:28 */     if (this.a.bb().nextInt(400) != 0) {
/* 26:29 */       return false;
/* 27:   */     }
/* 28:32 */     List localList = this.a.o.a(agp.class, this.a.aQ().b(6.0D, 3.0D, 6.0D));
/* 29:33 */     double d1 = 1.7976931348623157E+308D;
/* 30:34 */     for (Object localObject = localList.iterator(); ((Iterator)localObject).hasNext();)
/* 31:   */     {
/* 32:34 */       agp localagp = (agp)((Iterator)localObject).next();
/* 33:35 */       if ((localagp != this.a) && 
/* 34:   */       
/* 35:   */ 
/* 36:38 */         (!localagp.cl()) && 
/* 37:   */         
/* 38:   */ 
/* 39:41 */         (localagp.l() < 0))
/* 40:   */       {
/* 41:44 */         double d2 = localagp.h(this.a);
/* 42:45 */         if (d2 <= d1)
/* 43:   */         {
/* 44:48 */           d1 = d2;
/* 45:49 */           this.b = localagp;
/* 46:   */         }
/* 47:   */       }
/* 48:   */     }
/* 49:52 */     if (this.b == null)
/* 50:   */     {
/* 51:53 */       localObject = abf.a(this.a, 16, 3);
/* 52:54 */       if (localObject == null) {
/* 53:55 */         return false;
/* 54:   */       }
/* 55:   */     }
/* 56:58 */     return true;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public boolean b()
/* 60:   */   {
/* 61:63 */     return this.d > 0;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void c()
/* 65:   */   {
/* 66:68 */     if (this.b != null) {
/* 67:69 */       this.a.m(true);
/* 68:   */     }
/* 69:71 */     this.d = 1000;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void d()
/* 73:   */   {
/* 74:76 */     this.a.m(false);
/* 75:77 */     this.b = null;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void e()
/* 79:   */   {
/* 80:82 */     this.d -= 1;
/* 81:83 */     if (this.b != null)
/* 82:   */     {
/* 83:84 */       if (this.a.h(this.b) > 4.0D) {
/* 84:85 */         this.a.s().a(this.b, this.c);
/* 85:   */       }
/* 86:   */     }
/* 87:88 */     else if (this.a.s().m())
/* 88:   */     {
/* 89:89 */       brw localbrw = abf.a(this.a, 16, 3);
/* 90:90 */       if (localbrw == null) {
/* 91:91 */         return;
/* 92:   */       }
/* 93:93 */       this.a.s().a(localbrw.a, localbrw.b, localbrw.c, this.c);
/* 94:   */     }
/* 95:   */   }
/* 96:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     zv
 * JD-Core Version:    0.7.0.1
 */